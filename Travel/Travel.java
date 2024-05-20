public class Travel {
    private int people;

    public Travel(int n) {
        people = n;
    }

    public int goByVan() {
        return (people + 7) / 8; 
    }

    public int goByCanoe() {
        return (people + 2) / 3; 
    }

    public int goByPlane() {
        return (people + 11) / 12; 
    }
}
