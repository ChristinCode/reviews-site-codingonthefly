package org.wecancodeit.reviews;

import org.springframework.data.repository.CrudRepository;

public interface HashtagRepository extends CrudRepository<Hashtag, Long> {
    Hashtag findHashtagById(Long id);
    Hashtag findHashtagByHashtag(String hashtag);

}
