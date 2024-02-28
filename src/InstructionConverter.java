import java.nio.charset.StandardCharsets;

public class InstructionConverter {
	private String mnemonic;
	private String targetRegister;
	private String sourceRegister2;
	private String sourceRegister1;

	/**
     * Constructs an instance of the InstructionConverter.
     * Initializes any necessary state or configurations required for conversion.
     */
    public InstructionConverter(InstructionParser.ParsedInstruction instruction) {
    	this.mnemonic = instruction.getMnemonic();
    	this.targetRegister = instruction.getTarget();
    	this.sourceRegister1 = instruction.getSourceRegister1();
    	this.sourceRegister2 = instruction.getSourceRegister2();
    	
    }

    /**
     * Converts a parsed MIPS assembly instruction into machine code.
     * 
     * @param instruction A ParsedInstruction object containing the operation and
     *                    operands of the MIPS instruction.
     * @return A string representing the machine code in hexadecimal format.
     */
    public String convertToMachineCode(InstructionParser.ParsedInstruction instruction) {



        return null;
        // TODO
    	
    	
    	
    }

    /**
     * Converts an R-type MIPS instruction to its machine code representation.
     *
     * @param instruction A ParsedInstruction object specific to an R-type
     *                    instruction.
     * @return A string representing the binary machine code for the R-type
     *         instruction.
     */
    private String convertRType(InstructionParser.ParsedInstruction instruction) {
        StringBuilder machineCode = new StringBuilder();

        if(instruction.getMnemonic().equals("add")){
            machineCode.append("000000");
            int rd = Integer.parseInt(targetRegister);
            int rs = Integer.parseInt(sourceRegister1);
            int rt = Integer.parseInt(sourceRegister2);
            machineCode.append(String.format("%05X", (rs << 21) | (rt << 16) | (rd << 11)));
            machineCode.append("100000");
        }


        




        return null;
        // TODO
    }

    /**
     * Converts an I-type MIPS instruction to its machine code representation.
     * 
     * @param instruction A ParsedInstruction object specific to an I-type
     *                    instruction.
     * @return A string representing the binary machine code for the I-type
     *         instruction.
     */
    private String convertIType(InstructionParser.ParsedInstruction instruction) {
		return null;
        // TODO
    }

    /**
     * Converts a J-type MIPS instruction to its machine code representation.
     * 
     * @param instruction A ParsedInstruction object specific to a J-type
     *                    instruction.
     * @return A string representing the binary machine code for the J-type
     *         instruction.
     */
    private String convertJType(InstructionParser.ParsedInstruction instruction) {
		return null;
        // TODO


}

    
}
