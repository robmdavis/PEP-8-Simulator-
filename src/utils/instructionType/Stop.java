package utils.instructionType;

/**
 * This class is the stop  instruction
 */
public class Stop implements Instruction {
    /** The destination register number. */
    private String myRd;

    /** The operandSpecifier value. */
    private String operandSpecifier;

    /** The opcode of the instruction. */
    private String myOpcode;


    public Stop(String myOpcode, String myRd, String operandSpecifier) {
        this.myRd = myRd;
        this.operandSpecifier = operandSpecifier;
        this.myOpcode = myOpcode;
    }


    @Override
    public String getOpcode() {
        return myOpcode;
    }

//    @Override
//    public void execute() {
//        //need to be implemented
//    }
}
