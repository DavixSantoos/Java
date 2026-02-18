import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

  public class Main
  {
      public List<String> listaUsuarios = new ArrayList<>();

      public void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          while(this.listaUsuarios.size() < 10) {
              System.out.println("Adicione um usuario na lista");
              String usuario = scanner.nextLine();
              System.out.println(usuario.length());

              if (usuario.length() > 20) {
                  System.out.println("O usuario digitado tem mais que 50 caracteres");
                  return;
              }

              if (this.listaUsuarios.contains(usuario)) {
                  System.out.println("Üsuario ja esta na lista");
                  return;
              }

              this.listaUsuarios.add(usuario);

              System.out.println(this.listaUsuarios);

          }
      }

  }

