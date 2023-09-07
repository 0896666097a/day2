package org.example.dependencyinjection;

import org.example.pojo.Account;
import org.example.pojo.AccountRepository;
import org.example.pojo.AccountService;
import org.example.pojo.AccountServiceImpl;

import java.beans.ConstructorProperties;

public class AccountServicContructor implements AccountService {
    private AccountRepository accountRepository;

    public AccountServicContructor(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void transferMoney(long fromAccountId, long toAccountId, double amount) {
        Account soureceAccount = accountRepository.find(fromAccountId);
        Account targetAccount = accountRepository.find(toAccountId);
        soureceAccount.setBalance(soureceAccount.getBalance() - amount);
        targetAccount.setBalance(targetAccount.getBalance()+amount);
        accountRepository.update(soureceAccount);
        accountRepository.update(targetAccount);
    }




    @Override
    public void depositMoney(long accountId, double amount) throws Exception {
        Account account = accountRepository.find(accountId);
        account.setBalance(account.getBalance()+amount);
        accountRepository.update(account);
    }

    @Override
    public Account getAccount(long accountId) {
        return accountRepository.find(accountId);
    }
}

