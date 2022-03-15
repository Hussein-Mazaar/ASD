package backend.banking.strategy;

import backend.commons.InterestComputationStrategy;

public class PersonCheckingAccountComputation implements InterestComputationStrategy {
    @Override
    public double ComputeInterest(double accountBalance) {
        return (accountBalance < 1000) ? accountBalance * .015 : accountBalance * .025;
    }
}
