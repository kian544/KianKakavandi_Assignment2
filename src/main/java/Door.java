public class Door {
    private final Chamber a, b;
    private final Monster guard;

    public Door(Chamber a, Chamber b, Monster guard) {
        this.a = a;
        this.b = b;
        this.guard = guard;
        a.addDoor(this);
        b.addDoor(this);
    }

    public Door(Chamber a, Chamber b) {
        this(a, b, null);
    }

    public static void connect(Chamber a, Chamber b) {
        new Door(a, b);
    }

    public static void connect(Chamber a, Chamber b, Monster guard) {
        new Door(a, b, guard);
    }

    public Chamber getOther(Chamber current) {
        return current == a ? b : a;
    }

    public boolean monsterPresent() {
        return guard != null && guard.getHealth() > 0;
    }

    public Monster getMonster() {
        return guard;
    }
}
