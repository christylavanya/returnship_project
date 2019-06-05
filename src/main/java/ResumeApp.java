import com.hsi.service.ResumeService;
import com.hsi.service.ResumeServiceImpl;

public class ResumeApp {

	public static void main(String[] args) {
		
		ResumeService resumeService=new ResumeServiceImpl();
		
		System.out.println(resumeService.findAll().get(0).getName());
		System.out.println(resumeService.findAll().get(0).getEmail());
		System.out.println(resumeService.findAll().get(0).getMobile());

	}}
