package cn.itcast.day11.demo06;

public class Hero {
    private String name;
    private Skill skill;

    public void attack(){
        System.out.println(name);
        System.out.println("Start to attack using the skill: ");
        skill.use();
        System.out.println("The attack is finished. ");
    }

    public Hero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Hero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }
}
