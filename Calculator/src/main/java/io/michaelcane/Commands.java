package io.michaelcane;

public class Commands {

    Display display = new Display();
    User user = new User();

    Command command;

    public void giveCommand(Command command) {
        this.command = command;
    }

    public enum Command {
        /**
         * An enum that, if I can get it to work, should search for a command and activate it.
         * Each calculator function, as well each function that alters the Display and the Memory.
         */
        CLEARDISPLAY,
        CLEARERROR,
        CLEARMEMORY,
        COSINE,
        DIVIDE,
        FACTORIAL,
        INVERSECOSINE,
        INVERSELOGARITHM,
        INVERSENATURALLOG,
        INVERSESINE,
        INVERSETANGENT,
        INVERTPOSITIVEANDNEGATIVE,
        LOGARITHM,
        LOGBASE2,
        MULTIPLY,
        NATURALLOGARITHM,
        SETDISPLAYMODE,
        SETMEMORY,
        SINE,
        SQUARE,
        SQUAREROOT,
        SUBTRACT,
        SUM,
        RECALLMEMORY,
        TANGENT,
        VARIABLEEXPONENTIATION;
    }

    public void doTheThing() {
        switch (command) {
            /**
             * The switch statement for the above enum.
             */
            case COSINE:
                Calculator.cosine(user.isNumber);
                System.out.println("It's working!");
                break;
            case DIVIDE:
                Calculator.divide(display.getState(), user.isNumber);
                break;
            case FACTORIAL:
                Calculator.factorial(user.isNumber);
                break;
            case INVERSECOSINE:
                Calculator.inverseCosine(user.isNumber);
                break;
            case INVERSELOGARITHM:
                Calculator.inverseLogarithm(user.isNumber);
                break;
            case INVERSENATURALLOG:
                Calculator.inverseNaturalLog(user.isNumber);
                break;
            case INVERSESINE:
                Calculator.inverseSine(user.isNumber);
                break;
            case INVERSETANGENT:
                Calculator.inverseTangent(user.isNumber);
                break;
            case INVERTPOSITIVEANDNEGATIVE:
                Calculator.invertPositiveAndNegative(user.isNumber);
                break;
            case LOGARITHM:
                Calculator.logarithm(user.isNumber);
                break;
            case LOGBASE2:
                Calculator.logBase2(user.isNumber);
                break;
            case MULTIPLY:
                Calculator.multiply(display.getState(), user.isNumber);
                break;
            case NATURALLOGARITHM:
                Calculator.naturalLogarithm(user.isNumber);
                break;
            case SINE:
                Calculator.sine(user.isNumber);
                break;
            case SQUARE:
                Calculator.square(user.isNumber);
                break;
            case SQUAREROOT:
                Calculator.squareRoot(user.isNumber);
                break;
            case SUM:
                Calculator.sum(display.getState(), user.isNumber);
                break;
            case SUBTRACT:
                Calculator.subtract(display.getState(), user.isNumber);
                break;
            case TANGENT:
                Calculator.tangent(user.isNumber);
                break;
            case VARIABLEEXPONENTIATION:
                Calculator.variableExponentiation(display.getState(), user.isNumber);
                break;
            case RECALLMEMORY:
                System.out.println(user.getMemory());
                display.setState(user.getMemory());
                break;
            case SETMEMORY:
                user.setMemory(user.isNumber);
                break;
            case CLEARMEMORY:
                user.clearMemory();
                break;
            case CLEARDISPLAY:
                display.clearDisplay();
                break;
            case CLEARERROR:
                display.clearError();
                break;
            case SETDISPLAYMODE:
                display.setDisplayMode(user.getInput());
            default:
                System.out.println("I did not recognize that command. \nPlease enter a command.");
                break;
        }
    }
}
