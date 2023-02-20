public record Person(String name, int age) {
    public boolean isAdult(){
        return this.age > 18;
    }
}
