public class Magical extends Player implements SuperAbility {
    private String setMagicalAttackType;



    public String getSetMagicalAttackType() {
        return setMagicalAttackType;
    }

    public void setSetMagicalAttackType(String setMagicalAttackType) {
        this.setMagicalAttackType = setMagicalAttackType;
    }

    @Override
    public String accessSuperAbility() {
        return null;
    }
}
