CREATE TABLE `member` (
                          `member_idx`    int    NOT NULL    COMMENT '멤버 식별 pk',
                          `login_id`    varchar(40)    NOT NULL    COMMENT '로컬용 아이디',
                          `password`    varchar(45)    NOT NULL,
                          `name`    varchar(8)    NOT NULL
);

CREATE TABLE `planner_content` (
                                   `content_idx`    int    NOT NULL    COMMENT '내용 식별 pk',
                                   `member_idx`    int    NOT NULL    COMMENT '멤버 식별 pk',
                                   `content`    TEXT    NULL    COMMENT '플래너 내용'
);

CREATE TABLE `planner` (
                           `planner_idx`    int    NOT NULL    COMMENT '플래너 식별 pk',
                           `content_idx`    int    NOT NULL    COMMENT '내용 식별 pk',
                           `member_idx`    int    NOT NULL    COMMENT '멤버 식별 pk'
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
                                                             `member_idx`
    );

ALTER TABLE `planner_content` ADD CONSTRAINT `PK_PLANNER_CONTENT` PRIMARY KEY (
                                                                               `content_idx`,
                                                                               `member_idx`
    );

ALTER TABLE `planner` ADD CONSTRAINT `PK_PLANNER` PRIMARY KEY (
                                                               `planner_idx`,
                                                               `content_idx`,
                                                               `member_idx`
    );

ALTER TABLE `planner_content` ADD CONSTRAINT `FK_member_TO_planner_content_1` FOREIGN KEY (
                                                                                           `member_idx`
    )
    REFERENCES `member` (
                         `member_idx`
        );

ALTER TABLE `planner` ADD CONSTRAINT `FK_planner_content_TO_planner_1` FOREIGN KEY (
                                                                                    `content_idx`
    )
    REFERENCES `planner_content` (
                                  `content_idx`
        );

ALTER TABLE `planner` ADD CONSTRAINT `FK_planner_content_TO_planner_2` FOREIGN KEY (
                                                                                    `member_idx`
    )
    REFERENCES `planner_content` (
                                  `member_idx`
        );