package tr.edu.medipol.OgrenciWebServisi;

import java.util.*;

import org.springframework.web.bind.annotation.*;

// http://localhost:8080/ogrenci/listele

@RestController				//   Rest web servis sinifi ozelligi kazandiriyoruz.
@RequestMapping("/ogrenci") // "/ogrenci" ile baslayan web isteklerini bu sınıfa yönlendirir.
public class OgrenciRestApi {
	
	private static final List<String> OGRENCILER = new ArrayList<>();
	
	
	// statik blok
	{
		OGRENCILER.add("Jane");
		OGRENCILER.add("Joe");
		OGRENCILER.add("Henry");

	}
	
	// GET - veri almak -> kısaca
	// POST - veri göndermek -> kısaca
	
	@GetMapping("/listele")
	public List<String> listele() {
		return OGRENCILER;
	}

}
