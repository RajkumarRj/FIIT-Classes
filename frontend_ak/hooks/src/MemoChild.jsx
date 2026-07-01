import React from "react";

const MemoChild = React.memo(({ content, buttonClick }) => {
  console.log("Memo child rendered");

  buttonClick();

  return (
    <div>
      <h2>{content}</h2>
      {/* <button onClick={buttonClick}>Child count button</button> */}
    </div>
  );
});
export default MemoChild;
