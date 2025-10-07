public class MachineACafe {
	public enum State{
		IDLE {
			@Override
			public void entrerMonnaie(Piece piece) {

			}

			@Override
			public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
				afficherPasAssez(, toucheBoisson);
				return;
			}

			@Override
			public void rendreMonnaie(MachineACafe machineACafe) {

			}
		},COLLECTE {
			@Override
			public void entrerMonnaie(Piece piece) {
				setState(State.COLLECTE);
			}

			@Override
			public void selectionnerBoisson(ToucheBoisson toucheBoisson) {

			}
		},PAS_ASSEZ {
			@Override
			public void entrerMonnaie(MachineACafe machineACafe,Piece piece) {
				if (machineACafe.boisson.getPrix() > machineACafe.montantEnCours) {
					afficherPasAssez(machineACafe,machineACafe.boisson);
				}else {
					machineACafe.montantEnCours -= machineACafe.boisson.getPrix();
					afficherBoisson(machineACafe.boisson);
					machineACafe.boisson = null;
					afficherMontant(machineACafe);
					if (machineACafe.montantEnCours == 0)
						machineACafe.etatCourant = State.IDLE;
					else
						machineACafe.etatCourant =  machineACafe.collecte;
				}
			}

			@Override
			public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
				throw new IllegalStateException();
			}
		};

		public void afficherMontant(MachineACafe mc) {
			System.out.println(mc.montantEnCours + " cents disponibles");
		}

		public void afficherRetour(MachineACafe mc) {
			System.out.println(mc.montantEnCours + " cents rendus");
		}

		public void afficherPasAssez(MachineACafe mc,ToucheBoisson toucheBoisson) {
			System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
			System.out.println("Il manque encore " + (toucheBoisson.getPrix() - mc.montantEnCours) + " cents");
		}

		public void afficherBoisson(ToucheBoisson toucheBoisson) {
			System.out.println("Voici un " + toucheBoisson);

		}
		
		public void entrerMonnaie(MachineACafe mc,Piece piece){
			mc.montantEnCours += piece.getValeur();
			afficherMontant(mc);
		};

		public void selectionnerBoisson(MachineACafe mc,ToucheBoisson toucheBoisson){
			if (toucheBoisson.getPrix() > mc.montantEnCours) {
				mc.boisson = toucheBoisson;
				afficherPasAssez(mc, mc.boisson);
				mc.boisson = toucheBoisson;
				mc.etatCourant =  State.PAS_ASSEZ;
				return;
			}
			mc.montantEnCours -= toucheBoisson.getPrix();
			afficherBoisson(toucheBoisson);
			afficherMontant(mc);
			if (mc.montantEnCours == 0)
				mc.etatCourant = State.IDLE;
			else
				mc.etatCourant = State.COLLECTE;
		};

		public void rendreMonnaie(MachineACafe mc){
			afficherRetour(mc);
			mc.montantEnCours = 0;
			mc.boisson = null;
		}
	};
	
	private int montantEnCours = 0;
	private State etatCourant;
	private ToucheBoisson boisson = null;

	public MachineACafe() {
		this.etatCourant = State.IDLE;
	}

	public void entrerMonnaie(Piece piece) {

		if ( etatCourant != State.PAS_ASSEZ)

		else  else {
			mc.montantEnCours -= boisson.getPrix();
			afficherBoisson(boisson);
			boisson = null;
			afficherMontant();
			if (mc.montantEnCours == 0)
				etatCourant =  State.IDLE;
			else
				etatCourant =  State.COLLECTE;
		}
	}
	
	public void rendreMonnaie() {
		if (etatCourant != State.IDLE) {
			afficherRetour();
			mc.montantEnCours = 0;
			boisson = null;
		}
		etatCourant = State.IDLE;
	}

	public void setState(State state) {
		this.etatCourant = state;
	}
}
