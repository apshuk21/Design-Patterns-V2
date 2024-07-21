package prototypeandregistry;

public class IntelligentStudent extends Student {

    private int qa;

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent st) {
        super(st);
        this.qa = st.qa;
    }

    @Override
    public IntelligentStudent copy() {
        return new IntelligentStudent(this);
    }

    public int getQa() {
        return qa;
    }
}
