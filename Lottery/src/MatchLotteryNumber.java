public class MatchLotteryNumber {
    LotteryNumber randomNum1 = new LotteryNumber();

    public boolean matchLotteryNumbers1() {
        if (randomNum1.equals(Lottery.num1)) {
            return true;
        }
        return false;
    }
    LotteryNumber randomNum2 = new LotteryNumber();


    public boolean matchLotteryNumbers2() {
        if (randomNum2.equals(Lottery.num2)) {
            return true;
        }
        return false;
    }
    LotteryNumber randomNum3 = new LotteryNumber();
    public boolean matchLotteryNumbers3() {
        if (randomNum3.equals(Lottery.num3)) {
            return true;
        }
        return false;
    }
}