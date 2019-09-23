class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int squareOfSum = 0;
        for (int i = 1; i <= input; i++) {
            squareOfSum += i;
        }
        return (int)Math.pow(squareOfSum,2);
    }

    int computeSumOfSquaresTo(int input) {
        int sumOfSquares = 0;
        for ( int i = 1; i <= input; i++) {
            sumOfSquares += (int)Math.pow(i,2);
        }
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
