package proj_static2;

public class estatics {

	static  String professor; // professor é um so pra todos os alunos//
			String aluno;
	
			static void ensinar() {
				/*System.out.println(aluno);// erro pois metodos estaticos,
				so podem acessar atricutos estaticos*/
				System.out.println(" ensinando Programaçao orientada:" + professor);
			}
}
