public class Main {
    public static void main(String[] args) {
        Member member = new Member("ok", 123, "A");
        Member member1 = new Member("Cddd", 321, "B");
        Trainer trainer = new Trainer("sfg",435,"Boxing");
        member1.assignTrainer(trainer);

    }
}