package cn.wangyequn.renrenfastcopyapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.wangyequn.renrenfastcopyapi.sys.mapper")
public class RenrenFastCopyApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenrenFastCopyApiApplication.class, args);
	}

}
