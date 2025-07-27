import React from "react";
import "./Cohort.css";

function CohortDetails({ cohort }) {
  const headingStyle = {
    color: cohort.status.toLowerCase() === "ongoing" ? "green" : "blue"
  };

  return (
  <div className="box">

      <h3 style={headingStyle}>{cohort.name}</h3>
      <dl>
        <dt>Trainer:</dt>
        <dd>{cohort.trainer}</dd>

        <dt>Status:</dt>
        <dd>{cohort.status}</dd>

        <dt>Start Date:</dt>
        <dd>{cohort.startDate}</dd>

        <dt>End Date:</dt>
        <dd>{cohort.endDate}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
