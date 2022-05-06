package pro.sky.java.course4.work5.service;

import org.springframework.web.multipart.MultipartFile;
import pro.sky.java.course4.work5.model.Avatar;

import java.io.IOException;
import java.util.List;

public interface AvatarService {
    void uploadStudentAvatar(Long avatarId, MultipartFile avatarFile) throws IOException;

    Avatar findStudentAvatar(Long avatarId);

    List<Avatar> getPageAvatar(int pageNumber, int pageSize);
}
