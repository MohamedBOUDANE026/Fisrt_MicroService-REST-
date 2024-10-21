package ord.sid.bank_account_service.service;

import ord.sid.bank_account_service.dto.BankAccountRequestDTO;
import ord.sid.bank_account_service.dto.BankAccountResponseDTO;
import ord.sid.bank_account_service.entities.BankAccount;

public interface AccountService {
   BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
