public class Warrior extends Player implements SuperAbility {
    private String setWarriorAttackType;



    public String getSetWarriorAttackType() {
        return setWarriorAttackType;
    }

    public void setSetWarriorAttackType(String setWarriorAttackType) {
        this.setWarriorAttackType = setWarriorAttackType;
    }

    @Override
    public String accessSuperAbility() {
        return null;
    }
}
