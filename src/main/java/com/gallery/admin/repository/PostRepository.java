package com.gallery.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;

@Repository
public interface PostRepository extends JpaRepository<Member, Long> {
}
