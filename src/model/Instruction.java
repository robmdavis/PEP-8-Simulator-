package model;

/**
 * This class is the interface of all instructions
 */

public class Instruction {
	/**
	 * The destination register number.
	 */
	private String myRd;

	/** The operandSpecifier value. */
	private String myOperand;

	/**
	 * The opcode of the instruction.
	 */
	private String myOpcode;

	public Instruction(String myOpcode, String myRd, String operandSpecifier) {
		this.myRd = myRd;
		this.myOperand= operandSpecifier;
		this.myOpcode = myOpcode;
	}

	public String getOpcode() {
		return myOpcode;
	}
	public String getOperand() {
		return myOperand;
	}
	public String getRegister() {
		return myRd;
	};
}
