package backend.banking.strategy;

import backend.commons.InterestComputationStrategy;

public class CompanyCheckingAccountComputation implements InterestComputationStrategy {
    @Override
    public double computeInterest(double accountBalance) {
        return (accountBalance < 50000) ? accountBalance * .015 : accountBalance * .025;
    }
}
