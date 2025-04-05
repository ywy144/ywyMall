CREATE TABLE product_base_info (
                                   id INT AUTO_INCREMENT,
                                   product_id INT NOT NULL UNIQUE,
                                   product_name varchar(20) NOT NULL,
                                   brand varchar(20) NOT NULL,
                                   status INT NOT NULL, -- 1: 在售 2: 下架 3: 缺货
                                   first_level_category INT NOT NULL,
                                   second_level_category INT, -- 约定：一个一级分类下有5个二级分类，即1-1 1-2 1-3 1-4 1-5 2-6 ...
                                   creation_time DATETIME NOT NULL,
                                   update_time DATETIME,
                                   is_deleted INT NOT NULL,
                                   primary key (id)
);

-- product_base_info 数据
DELIMITER //

CREATE PROCEDURE insert_product_base_info()
BEGIN
    SET @i = 1, @brand_i = 1, @flc_i = 1, @fsc_i = 1;
    WHILE @i <= 100 DO
            SET @prod_id = LPAD(@i, 6, '0');
            SET @prod_name = CONCAT('prod', @prod_id);
            SET @brand = CONCAT('brand', @brand_i);
            INSERT INTO product_base_info
            (product_id, product_name, brand, status, first_level_category, second_level_category, creation_time, update_time, is_deleted)
            VALUES
                (@prod_id, @prod_name, @brand, 1, @flc_i, @fsc_i, NOW(), NOW(), 0);
            IF @i % 3 = 0 THEN
                SET @brand_i = @brand_i + 1;
            END IF;
            IF @i % 5 = 0 THEN
                SET @flc_i = @flc_i + 1;
            END IF;

            SET @i = @i + 1;
            SET @fsc_i = @fsc_i + 1;
        END WHILE;
END //
DELIMITER ;