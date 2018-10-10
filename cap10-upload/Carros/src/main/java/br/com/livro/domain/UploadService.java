package br.com.livro.domain;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
@Component
public class UploadService {
	public String upload(String fileName, InputStream in) throws IOException {
		if(fileName == null || in == null) {
			throw new IllegalArgumentException("Par�metros inv�lidos");
		}
		// Pasta tempor�ria da JVM
		File tmpDir = new File(System.getProperty("java.io.tmpdir"),"carros");
		if(!tmpDir.exists()) {
			// Cria a pasta carros se n�o existe
			tmpDir.mkdir();
		}
		// Cria o arquivo
		File file = new File(tmpDir, fileName);
		// Abre a OutputStream para escrever no arquivo
		FileOutputStream out = new FileOutputStream(file);
		// Escreve os dados no arquivo
		IOUtils.copy(in, out);
		IOUtils.closeQuietly(out);
		// Retorna o caminho do arquivo
		String path = file.getAbsolutePath();
		return path;
	}
}
