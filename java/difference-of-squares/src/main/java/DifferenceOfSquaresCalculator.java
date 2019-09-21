class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sqOfSum = 0;
        for (int i = 1; i <= input; i++) {
            sqOfSum += i;
        }
        return (int)Math.pow(sqOfSum,2);
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSq = 0;
        for ( int i = 1; i <= input; i++) {
            sumOfSq += (int)Math.pow(i,2);
        }
        return sumOfSq;
    }

    int computeDifferenceOfSquares(int input) {
        int diff = 0;
        diff = computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
        return diff;
    }

}
