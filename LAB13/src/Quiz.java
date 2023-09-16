public class Quiz {

    private int id;
    private int mark;

    Quiz(int id, int mark) {

        this.id = id;
        this.mark = mark;
    }

    public int getId() {

        return id;
    }

    public int getMark() {

        return mark;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setMark(int mark) {
        
        this.mark = mark;
    }
    
}
