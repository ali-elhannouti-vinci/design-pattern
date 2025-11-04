public class RobotImpl implements Robot {
    private int pV;
    private final int firePower;
    private final int shieldPower;
    private final int shootingSpeed;
    private final String name;

    private RobotImpl(RobotBuilder builder) {
        this.pV = builder.pV;
        this.firePower = builder.firePower;
        this.shieldPower = builder.shieldPower;
        this.shootingSpeed = builder.shootingSpeed;
        this.name = builder.name;
    }

    public int getPV() {
        return pV;
    }

    public int getCanon() {
        return firePower;
    }

    public int getShield() {
        return shieldPower;
    }

    public int getFreq() {
        return shootingSpeed;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int diffLife(int i) {
        return pV+=i;
    }


    public static class RobotBuilder {
        private int pV;
        private int firePower;
        private int shieldPower;
        private int shootingSpeed;
        private final String name;

        public RobotBuilder(String name) {
            this.pV = 100;
            this.firePower = 1;
            this.shieldPower = 1;
            this.shootingSpeed = 100;
            this.name = name;
        }

        public RobotBuilder pV(int pV){
            this.pV = pV;
            return this;
        }

        public RobotBuilder firePower(int firePower){
            this.firePower = firePower;
            return this;
        }

        public RobotBuilder shieldPower(int shieldPower){
            this.shieldPower = shieldPower;
            return this;
        }

        public RobotBuilder shootingSpeed(int shootingSpeed){
            this.shootingSpeed = shootingSpeed;
            return this;
        }

        public Robot build(){
            return new RobotImpl(this);
        }
    }
}


