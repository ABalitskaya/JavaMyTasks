package Enums;
public enum Color {
    // Все писать большими буквами
    BLUE {
        @Override
        void specialMethod() {
            System.out.println("blue");
        }
    },

    GREEN{
        @Override
        void specialMethod() {
            System.out.println("green");
        }
    },
    YELLOW{
        @Override
        void specialMethod() {
            System.out.println("yellow");
        }
    },
    RED{
        @Override
        void specialMethod() {
            System.out.println("red");
        }
    };

    Color() {
        System.out.println("This is constructor " + this.name());
    }

    public void someMethod() {
        System.out.println("This is enum method " + this.name());
    }

    abstract void specialMethod();
}
