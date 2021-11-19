package skipasses;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public abstract class SkiPass {

    private int ID;
    private Type type;
    private int term;
    private boolean blocked;


    public SkiPass(int SkiPassId, Type type, int term) {
        this.ID = SkiPassId;
        this.blocked = false;
        this.term = 30;
    }

    public SkiPass() {}

    public int getSkiPassId(){
        return ID;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked() {
        this.blocked = true;
    }
}
