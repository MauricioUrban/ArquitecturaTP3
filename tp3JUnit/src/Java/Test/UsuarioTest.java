package Java.Test;

import Java.restaurant.Usuario;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThrows;

public class UsuarioTest {

        @Test
        public void testUsuariosRepetidos() {

            Usuario u1 = new Usuario("Homero Simpson", 0, 350, "homerojsimpson@springfield.com");
            Usuario u2 = new Usuario("Homero Simpson", 0, 500, "homerojsimpson@springfield.com");

            // Aquí debes verificar que agregar usuarios repetidos lanza una excepción
            // Puedes usar una excepción personalizada, por ejemplo, UsuarioRepetidoException.

            // Implementa la lógica para verificar si los usuarios ya existen en tu sistema
            // y lanza la excepción si ya existen.
            assertThrows(UsuarioRepetidoException.class, () -> agregarUsuarioRepetido(u1));
            assertThrows(UsuarioRepetidoException.class, () -> agregarUsuarioRepetido(u2));
        }

        private List<Usuario> usuarios = new ArrayList<>();

        private void agregarUsuarioRepetido(Usuario usuario) throws UsuarioRepetidoException {
            // Verificar si el usuario ya existe en la lista de usuarios
            for (Usuario u : usuarios) {
                if (u.equals(usuario)) {
                    throw new UsuarioRepetidoException();
                }
            }

            // Si el usuario no existe, agrégalo a la lista de usuarios
            usuarios.add(usuario);
        }
}
