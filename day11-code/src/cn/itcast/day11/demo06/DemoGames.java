package cn.itcast.day11.demo06;

public class DemoGames {
    public static void main(String[] args) {

//        implementation class
//        Skill skill = new SkillImpl();

//        anonymous inner class
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia-pia-pia");
//            }
//        };
//
//        Hero hero = new Hero("Scarllett Johnasson",skill);

        Hero hero = new Hero("George Clooney", new Skill() {
            @Override
            public void use() {
                System.out.println("biajiu-biajiu");
            }
        });

        hero.attack();
    }
}
