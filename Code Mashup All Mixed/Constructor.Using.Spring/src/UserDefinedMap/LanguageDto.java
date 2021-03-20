package UserDefinedMap;

public class LanguageDto {

	private int lid;
	private String language;
	public LanguageDto(int lid, String language) {
		super();
		this.lid = lid;
		this.language = language;
	}
	@Override
	public String toString() {
		return "LanguageDto [lid=" + lid + ", language=" + language + "]";
	}
	
	
	
}
