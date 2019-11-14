public class Mental extends Player implements SuperAbility {
    private String setMentalAttackType;



    public String getSetMentalAttackType() {
        return setMentalAttackType;
    }

    public void setSetMentalAttackType(String setMentalAttackType) {
        this.setMentalAttackType = setMentalAttackType;
    }

    @Override
    public String accessSuperAbility() {
        return null;
    }
}
