package mx.ipn.cic.biblioteca.AdminControl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.ipn.cic.biblioteca.AdminControl.model.LoanModel;
import mx.ipn.cic.biblioteca.AdminControl.repositories.ILoanRepository;

@Service
public class LoanService {

	@Autowired
	private ILoanRepository loanRepository;

	public LoanModel saveNewLoan(LoanModel newLoan) {

		return this.loanRepository.save(newLoan);

	}

	public List<LoanModel> listAll() {

		return this.loanRepository.findAll();

	}

	public boolean deleteLoan(Integer id) {

		this.loanRepository.deleteById(id);

		return true;

	}

	public LoanModel update(LoanModel loan) {

		return this.loanRepository.save(loan);

	}

	public LoanModel findById(Integer id) {

		Optional<LoanModel> found = 
				this.loanRepository.findById(id);

		if (found.isPresent()) {
		
			return found.get();
			
		} else {

			return null;
		}

	}

}
