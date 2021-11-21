class CreditEligable {
    public static void main(String[] args) {
        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;
        boolean isEligable = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

        System.out.println(isEligable);
    }
}
