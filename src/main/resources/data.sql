CREATE TABLE `member` (
                          `member_idx`	int	NOT NULL	COMMENT '멤버 식별 pk',
                          `login_id`	varchar(40)	NOT NULL	COMMENT '로컬용 아이디',
                          `password`	varchar(45)	NOT NULL,
                          `name`	varchar(8)	NOT NULL
);

CREATE TABLE `planner` (
                           `planner_idx`	int	NOT NULL	COMMENT '플래너 식별 pk',
                           `member_idx`	int	NOT NULL	COMMENT '멤버 식별 pk',
                           `content`	TEXT	NULL
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
                                                             `member_idx`
    );

ALTER TABLE `planner` ADD CONSTRAINT `PK_PLANNER` PRIMARY KEY (
                                                               `planner_idx`,
                                                               `member_idx`
    );

ALTER TABLE `planner` ADD CONSTRAINT `FK_member_TO_planner_1` FOREIGN KEY (
                                                                           `member_idx`
    )
    REFERENCES `member` (
                         `member_idx`
        );

