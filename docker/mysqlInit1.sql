    CREATE TABLE `d_studys` (
      `id` bigint(20) NOT NULL AUTO_INCREMENT,
      `name` varchar(100) CHARACTER SET utf8 DEFAULT NULL,
      `status` varchar(50) DEFAULT NULL,
      `projectId` varchar(36) NOT NULL,
      `notes` text,
      `created_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
      `updated_timestamp` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
      PRIMARY KEY (`id`)
    ) ENGINE=InnoDB DEFAULT CHARSET=latin1;

   
   ALTER TABLE `dturks`.`d_hits` 
ADD COLUMN `studyid` bigint(20) DEFAULT '0' AFTER `isURL`;

