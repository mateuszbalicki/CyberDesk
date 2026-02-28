public class User {
    private String userName;
    private int age;
    private String rank;

    public User(String userName, int age, String rank) {
        this.userName = userName;
        this.age = age;
        this.rank = rank;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", rank='" + rank + '\'' +
                '}';
    }

    public void greetUser(User user) {
        System.out.println("Hello " + user.getUserName());
    }
}
