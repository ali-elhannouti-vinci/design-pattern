
public class Bear {
    private enum State {
        SLEEPING {
            @Override
            public void attack(Bear bear) {
                System.out.println("Zzzzzz");
            }

            @Override
            public void sleep(Bear b) {
                throw new RuntimeException("already sleeping");
            }
        }, NOT_SLEEPING {
            @Override
            public void attack(Bear bear) {
                System.out.println("Zzzzzz");
            }

            @Override
            public void sleep(Bear b) {
                throw new RuntimeException("already sleeping");
            }
        };

        public abstract void attack(Bear bear);

        public void sleep(Bear b) {
            b.setState(State.SLEEPING);
        }

        public void wakeup(Bear bear) {
            bear.setState(State.NOT_SLEEPING);
        }
    }

    private State state;

    public Bear() {
        setState(State.NOT_SLEEPING);
    }

    public void attack() {
        state.attack(this);
    }

    public void sleep() {
        state.sleep(this);
    }

    public void wakeup() {
        state.wakeup(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public static void main(String[] args) {
        Bear b = new Bear();
        b.attack();
        b.sleep();
        b.attack();
    }
}
