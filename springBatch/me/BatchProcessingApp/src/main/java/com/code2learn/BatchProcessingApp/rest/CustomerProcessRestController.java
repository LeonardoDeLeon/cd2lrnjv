package com.code2learn.BatchProcessingApp.rest;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerProcessRestController 
{
    @Autowired
    private JobLauncher jobLauncher;

    @Autowired
    private Job job;

    @GetMapping("/import")
    public void loadData() throws Exception
    {
        JobParameters jobParameter=new JobParametersBuilder()
            .addLong("StartAt",System.currentTimeMillis())
            .toJobParameters();

        jobLauncher.run(job, jobParameter);
    }

}
