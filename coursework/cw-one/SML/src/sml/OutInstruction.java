package sml;

/**
 * Created by apinter on 07/03/2017.
 */
public class OutInstruction extends Instruction {
    private int register;
    //private int value;

    public OutInstruction(String label, String opcode) {
        super(label, opcode);
    }

    public OutInstruction(String label, int register) {
        super(label, "out");
        this.register = register;
        //this.value = value;
    }

    @Override
    public void execute(Machine m) { System.out.println(m.getRegisters().getRegister(register)); }

    @Override
    public String toString() {
        return super.toString() + " register " + register;
    }
}