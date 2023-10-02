record User(int userId, String name) {}

class Test{
    public void testing(Object ob){
        if (ob instanceof User(int userId, String name)) {
            System.out.println("user id :" + userId);
            System.out.println("UserName: " + name);
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.testing(new User(101, "Raushan"));
    }
}