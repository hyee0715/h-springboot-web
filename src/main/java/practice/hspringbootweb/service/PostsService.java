package practice.hspringbootweb.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import practice.hspringbootweb.domain.posts.PostsRepository;
import practice.hspringbootweb.web.dto.PostsSaveRequestDto;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }
}