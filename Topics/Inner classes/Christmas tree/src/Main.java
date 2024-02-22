class ChristmasTree {

    private String color;

    public ChristmasTree(String color) {
        this.color = color;
    }

        void putTreeTopper(String str) {
            TreeTopper treeTopper  = new TreeTopper(str);
            treeTopper.sparkle();
        }

    class TreeTopper {

        private String color;        

        public TreeTopper(String color) {
            this.color = color;
        }

        void sparkle() {
            System.out.printf("Sparkling %s tree topper looks stunning with %s Christmas tree!", color, ChristmasTree.this.color);
        }
    }
}

// this code should work
class CreateHoliday {

    public static void main(String[] args) {

        ChristmasTree christmasTree = new ChristmasTree("green");
        christmasTree.putTreeTopper("silver");
    }
}