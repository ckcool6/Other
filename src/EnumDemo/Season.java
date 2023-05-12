package EnumDemo;

public enum Season {
    SPRING ("春"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    }, SUMMER ("夏"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    }, AUTUMN ("秋"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    }, WINTER ("冬"){
        @Override
        public void show() {
            System.out.println(this.name);
        }
    };
    public String name;

    private Season() {
    }

    private Season(String name) {
        this.name = name;
    }

    public abstract void show();
}
