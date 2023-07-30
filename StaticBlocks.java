//the static blocks will run before the main methods block

class blockTest {
    static {
        System.out.println("Static block\n\n");
    }
}
public class StaticBlocks {
    static {
        System.out.println("Block - 1 ");
    }

    public static void main(String args[]) {
        blockTest o = new blockTest();
        System.out.println("Main");
        StaticBlocks k = new StaticBlocks();
    }

    static {
        System.out.println("Block - 2");
    }
}