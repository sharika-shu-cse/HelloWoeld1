public class HelloWorld1 {
        private int roll;
        private String name;
        private boolean passed;
        public HelloWorld1(){ /* Constructor */
            roll = 100;
            name = "CSE";
            passed = true;
        }
        public HelloWorld1(int roll, String name, boolean passed){ /* Constructor */
            this.roll = roll;
            this.name = name;
            this.passed = passed;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public void setPassed(boolean passed) {
            this.passed = passed;
        }

        public int getRoll() {
            return roll;
        }

        public boolean isPassed() {
            return passed;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public static void main(String[] args) {
            HelloWorld1 helloWorld = new HelloWorld1();
            HelloWorld1 helloWorld2 = new HelloWorld1(300,"SHU", true);
            helloWorld.setName("ICE");
            helloWorld.setRoll(400);
            helloWorld.setPassed(false);
            System.out.println(helloWorld2.getName());
            System.out.println(helloWorld.getRoll());
            System.out.println(helloWorld2.isPassed());
        }

}
