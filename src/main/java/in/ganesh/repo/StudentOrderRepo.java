package in.ganesh.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ganesh.dto.StudentOrder;

public interface StudentOrderRepo extends JpaRepository<StudentOrder, Long> {

	public StudentOrder findByRazorPayOrderId(String razorPayOrderId);

}
